private void heapSort(int count, nl.weeaboo.lua2.vm.LuaValue cmpfunc) {
    heapify(count, cmpfunc);
    for (int end = count - 1; end > 0;) {
        swap(end, 0);
        siftDown(0, (--end), cmpfunc);
    }
}