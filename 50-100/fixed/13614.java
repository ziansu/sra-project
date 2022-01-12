public boolean getNotified() {
    android.content.ComponentName cn = new android.content.ComponentName(getApplicationContext(), com.encrpyt.whatsapp.whatsappencrypt.MyService.class);
    java.lang.String flat = Settings.Secure.getString(getApplicationContext().getContentResolver(), "enabled_notification_listeners");
    return (flat != null) && (flat.contains(cn.flattenToString()));
}