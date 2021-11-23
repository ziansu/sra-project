@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    if (!((boolean) (megabasterd.MiscTools.swingReflectionInvokeAndWaitForReturn("isVisible", myframe)))) {
        megabasterd.MiscTools.swingReflectionInvoke("setExtendedState", myframe, javax.swing.JFrame.NORMAL);
        megabasterd.MiscTools.swingReflectionInvoke("setVisible", myframe, true);
    }else {
        megabasterd.MiscTools.swingReflectionInvoke("dispatchEvent", myframe, new java.awt.event.WindowEvent(myframe, java.awt.event.WindowEvent.WINDOW_CLOSING));
    }
}