public static void putSerializableExtra(android.content.Intent intent, java.io.Serializable... serializable) {
    if ((serializable.length) == 0)
        return ;
    
    intent.putExtra(com.dhy.xintent.XIntent.KEY_EXTRA, ((serializable.length) > 1 ? serializable : serializable[0]));
}