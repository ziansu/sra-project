@java.lang.Override
public org.eclipse.swt.graphics.Image getImage(java.lang.Object element) {
    com.piece_framework.makegood.core.result.Result result = ((com.piece_framework.makegood.core.result.Result) (element));
    if (result.isFixed()) {
        if (result.hasFailures()) {
            return failureIcon;
        }else
            if (result.hasErrors()) {
                return errorIcon;
            }else {
                return passIcon;
            }
        
    }else {
        return inProgressIcon;
    }
}