@java.lang.Override
public int getHeight() {
    java.lang.System.out.println(((("[GridLayout] real height = " + (super.getHeight())) + ", min height = ") + (minHeight)));
    return java.lang.Math.max(super.getHeight(), minHeight);
}