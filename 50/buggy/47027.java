public static boolean isVisible(org.pentaho.di.ui.spoon.trans.TransGraph graph) {
    return (graph.getChildren()[0]) instanceof org.eclipse.swt.browser.Browser;
}