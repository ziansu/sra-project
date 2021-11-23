@java.lang.Override
public void setType(java.lang.String newType) {
    if ((newType == null) || (newType.equals(type))) {
        java.lang.String oldType = type;
        type = newType;
        if (eNotificationRequired())
            eNotify(new org.eclipse.emf.ecore.impl.ENotificationImpl(this, org.eclipse.emf.common.notify.Notification.SET, org.eclipse.january.geometry.GeometryPackage.SHAPE__TYPE, oldType, type));
        
    }
}