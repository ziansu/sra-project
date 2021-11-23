public int getLimit(int komplexitaet) {
    switch (komplexitaet) {
        case 1 :
            {
                return 500;
            }
        case 2 :
            {
                return 800;
            }
        case 3 :
            {
                return 1200;
            }
        case 4 :
            {
                return 2500;
            }
        case 5 :
            {
                return 4000;
            }
    }
    return 0;
}