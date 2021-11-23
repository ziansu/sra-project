@java.lang.Override
public void __del_builtin__() {
    java.lang.System.out.println((((getClass().getSimpleName()) + " finalize: ") + (objectHandle)));
    if ((objectHandle) != 0)
        JyNI.JyNI.clearPyCPeer(objectHandle, 0);
    
}