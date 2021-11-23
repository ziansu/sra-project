public void saveContents() {
    if (!(this.persistent)) {
        return ;
    }
    java.io.ObjectOutputStream objOut;
    try {
        objOut = new java.io.ObjectOutputStream(new java.io.FileOutputStream(fileLocation));
        objOut.writeObject(this.data);
        objOut.writeObject(this.ridList);
        objOut.close();
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}