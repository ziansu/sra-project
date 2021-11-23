@java.lang.Override
public int getCurrentMana() {
    if (isFull())
        return maxmana;
    else
        return currMana;
    
}