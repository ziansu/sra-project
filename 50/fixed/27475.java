@java.lang.Override
public int getItemCount() {
    try {
        return posts.length();
    } catch (java.lang.NullPointerException ex) {
        return 0;
    }
}