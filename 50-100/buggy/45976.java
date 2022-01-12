public void writeNewId3ToMp3() {
    java.io.RandomAccessFile raff;
    try {
        raff = new java.io.RandomAccessFile("C:\\Test\\The_Flamin_Groovies_-_05_-_Dont_Put_Me_On.mp3", "rw");
        raff.seek(((raff.length()) - 128));
        raff.writeBytes(getNewId3Tag());
        raff.close();
    } catch (java.io.IOException e) {
        java.lang.System.out.println(e.toString());
    }
}