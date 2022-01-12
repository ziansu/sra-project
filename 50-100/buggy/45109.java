public int Ataque() {
    int x = getX();
    int x2 = 0;
    int mod;
    if (x < 500) {
        mod = x;
        mod = mod % 2;
        if (mod == 0)
            setImage(Atk01);
        else
            setImage(Atk02);
        
        move(50);
    }else {
        setImage(Atk03);
        band2 = 3;
    }
    return band2;
}