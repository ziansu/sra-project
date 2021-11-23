public void startReading(java.lang.String path, int index) {
    if (!(new java.io.File(path).exists()))
        return ;
    
    if (index < 0)
        index = 0;
    
    android.content.Intent intent = new android.content.Intent(this, com.japanzai.koroshiya.reader.Reader.class);
    android.os.Bundle b = new android.os.Bundle();
    b.putString("file", path);
    b.putInt("index", index);
    intent.putExtras(b);
    startActivity(intent);
}