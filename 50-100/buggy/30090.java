public void addLife() {
    life += 1;
    switch (life) {
        case 1 :
            x3.setVisibility(View.INVISIBLE);
            break;
        case 2 :
            x2.setVisibility(View.INVISIBLE);
            break;
        case 3 :
            x1.setVisibility(View.INVISIBLE);
            break;
        case 4 :
            check1.setVisibility(View.VISIBLE);
            break;
        case 5 :
            check2.setVisibility(View.VISIBLE);
        default :
            break;
    }
}