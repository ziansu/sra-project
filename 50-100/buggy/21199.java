public static application.ActionSticks2H parseAction(java.lang.String moveStr) {
    switch (moveStr) {
        case "0 2" :
        case "2 0" :
            return application.ActionSticks2H.LEFT_ATK_LEFT;
        case "0 3" :
        case "3 0" :
            return application.ActionSticks2H.LEFT_ATK_RIGHT;
        case "1 2" :
        case "2 1" :
            return application.ActionSticks2H.RIGHT_ATK_LEFT;
        case "1 3" :
        case "3 1" :
            return application.ActionSticks2H.RIGHT_ATK_RIGHT;
        default :
            throw new java.lang.RuntimeException(("unparsable move: " + moveStr));
    }
}