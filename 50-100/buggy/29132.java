private static void replaceEditable(android.text.Editable text, java.lang.String in, java.lang.String out) {
    int position = text.toString().indexOf(in);
    if (position >= 0) {
        text.replace(position, (position + (in.length())), out);
    }
}