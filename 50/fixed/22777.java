@java.lang.Override
public org.eclipse.swt.graphics.Image getIcon() {
    java.lang.System.out.println(path);
    return bebop.util.Resources.getIcon(path, attributes.isRegularFile());
}