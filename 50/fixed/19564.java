private void heapify(int count, nl.weeaboo.lua2.vm.LuaValue cmpfunc) {
    int start = (count - 2) / 2;
    while (start >= 0) {
        siftDown(start, (count - 1), cmpfunc);
        start--;
    } 
}