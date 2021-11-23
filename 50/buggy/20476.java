private static int calcNewScale() {
    switch (me.willjake.hamlet.render.Display.SCALE) {
        case 2 :
            return 3;
        case 3 :
            return 4;
        case 4 :
            return 1;
        default :
            return 2;
    }
}