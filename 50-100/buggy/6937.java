private static int whereToGo(int situation, boolean findUpper) {
    switch (situation) {
        case 1 :
            if (findUpper)
                return 0;
            else
                return 2;
            
        case 2 :
            if (findUpper)
                return 1;
            else
                return 0;
            
        case 3 :
            if (findUpper)
                return 1;
            else
                return 2;
            
        default :
            if (findUpper)
                return 2;
            else
                return 1;
            
    }
}