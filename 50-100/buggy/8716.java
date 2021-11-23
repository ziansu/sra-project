@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent arg0) {
    try {
        makeMessageBox(((java.lang.String) (r[i].invoke(pet))));
    } catch (java.lang.IllegalAccessException e) {
        e.printStackTrace();
    } catch (java.lang.IllegalArgumentException e) {
        e.printStackTrace();
    } catch (java.lang.reflect.InvocationTargetException e) {
        e.printStackTrace();
    }
}