private void doRun(int num) {
    for (int f = num; f <= 100; f += num)
        fach[(f - 1)] = !(fach[(f - 1)]);
    
}