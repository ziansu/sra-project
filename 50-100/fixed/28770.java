private void removeLife() {
    life -= 1;
    switch (life) {
        case 0 :
            x3.setVisibility(View.VISIBLE);
            break;
        case 1 :
            x2.setVisibility(View.VISIBLE);
            break;
        case 2 :
            x1.setVisibility(View.VISIBLE);
            break;
        case 3 :
            check1.setVisibility(View.INVISIBLE);
            break;
        case 4 :
            check2.setVisibility(View.INVISIBLE);
            break;
        default :
            onPause();
            break;
    }
}