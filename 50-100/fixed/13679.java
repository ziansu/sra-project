public void WriteFile(java.lang.String filename, java.lang.String msg) {
    if (msg == null)
        return ;
    
    try {
        java.io.FileOutputStream fos = openFileOutput(filename, com.chenqu.toolbox.easysoney.MODE_APPEND);
        fos.write(msg.getBytes());
        fos.close();
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}