@java.lang.Override
public void onClick(android.view.View v) {
    java.lang.String tag = v.getTag().toString();
    java.lang.System.out.println("I clicked on a classroom");
    java.lang.System.out.println(("The tag I clicked on was: " + tag));
    int tagNumber = java.lang.Integer.parseInt(tag);
    getTextBoxClicked(tagNumber);
}