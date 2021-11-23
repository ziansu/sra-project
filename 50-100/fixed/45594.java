private java.lang.String promptAction() throws java.io.IOException {
    java.lang.System.out.printf("There are %d songs available. Your options are: %n", mSongBook.getSongCount());
    for (java.util.Map.Entry<java.lang.String, java.lang.String> option : mMenu.entrySet()) {
        java.lang.System.out.printf("%s - %s %n", option.getKey(), option.getValue());
    }
    java.lang.System.out.print("What do you want to do: ");
    java.lang.String choice = mReader.readLine();
    return choice.trim().toLowerCase();
}