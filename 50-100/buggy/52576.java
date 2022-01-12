public static void startReading(java.lang.String path, int index, android.app.Activity act) {
    if (!(new java.io.File(path).exists()))
        return ;
    
    android.content.Intent intent = new android.content.Intent(act, com.japanzai.koroshiya.reader.Reader.class);
    android.os.Bundle b = new android.os.Bundle();
    b.putString("file", path);
    b.putInt("index", (index < 0 ? 0 : index));
    intent.putExtras(b);
    act.startActivity(intent);
}