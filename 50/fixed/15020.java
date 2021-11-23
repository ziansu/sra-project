@java.lang.Override
public void run() {
    android.content.Intent mainIntent = new android.content.Intent(this, com.slateandpencil.contact.MainActivity.class);
    this.startActivity(mainIntent);
    this.finish();
}