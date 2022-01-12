@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent arg0) {
    try {
        makeMessageBox(((java.lang.String) (r[p].invoke(pet, new java.lang.Object[]{  }))));
    } catch (java.lang.IllegalAccessException e) {
        e.printStackTrace();
    } catch (java.lang.IllegalArgumentException e) {
        e.printStackTrace();
    } catch (java.lang.reflect.InvocationTargetException e) {
        e.printStackTrace();
    }
}