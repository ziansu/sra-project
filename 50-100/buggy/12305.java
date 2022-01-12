@java.lang.Override
public boolean onMouseDown(com.totemdefender.input.MouseEvent event) {
    if (pointIsInBounds(event.mousePosition)) {
        for (com.totemdefender.menu.Component cmp : components) {
            if (cmp instanceof com.totemdefender.menu.TextEntry) {
                java.lang.System.out.println(worldToLocal(event.mousePosition));
            }
            if (cmp.pointIsInBounds(worldToLocal(event.mousePosition))) {
                setFocus(cmp);
                return cmp.onMouseDown(event);
            }
        }
    }else {
        java.lang.System.out.println("OUT BOUNDS");
    }
    return false;
}