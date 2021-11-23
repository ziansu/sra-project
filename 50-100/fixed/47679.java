public int GetRandomInteger(int min, int max) {
    if (max < min) {
        return 0;
    }
    if (min == max) {
        return (this.m_random.nextInt((max + 1))) + min;
    }else {
        return (this.m_random.nextInt(((max - min) + 1))) + min;
    }
}