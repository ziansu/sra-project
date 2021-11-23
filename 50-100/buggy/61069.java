public int alitajuntaValinta(int edellinen, boolean kaksiPutkeen, boolean voittiko) {
    if (edellinen == (-1)) {
        return aloitusValinta();
    }
    if (kaksiPutkeen) {
        if (edellinen == 0) {
            return 2;
        }else
            if (edellinen == 1) {
                return 0;
            }else {
                return 1;
            }
        
    }else
        if (!voittiko) {
            return haviajanValinta(edellinen);
        }else {
            return taulukkoValinta(edellinen);
        }
    
}