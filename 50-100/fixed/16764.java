private void postToSwingEDT(java.lang.Runnable taskCode) {
    try {
        java.lang.Class<?> cls = java.lang.Class.forName("javax.swing.SwingUtilities");
        java.lang.reflect.Method postMethod = cls.getDeclaredMethod("invokeLater", java.lang.Runnable.class);
        postMethod.invoke(null, taskCode);
    } catch (java.lang.ClassNotFoundException | java.lang.NoSuchMethodException | java.lang.SecurityException | java.lang.IllegalAccessException | java.lang.IllegalArgumentException | java.lang.reflect.InvocationTargetException e) {
        throw new java.lang.RuntimeException(("Pyjama: Cannot find proper posting method for Swing framework" + (e.toString())));
    }
}