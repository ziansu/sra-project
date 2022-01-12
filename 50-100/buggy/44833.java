private void move(int input) {
    switch (input) {
        case 0 :
            {
                (position.y)++;
                break;
            }
        case 1 :
            {
                (position.y)--;
                break;
            }
        case 2 :
            {
                (position.x)--;
                break;
            }
        case 3 :
            {
                (position.x)++;
            }
    }
}