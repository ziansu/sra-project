private void heapSort(int count, nl.weeaboo.lua2.vm.LuaValue cmpfunc) {
    heapify(count, cmpfunc);
    int end = count - 1;
    while (end > 0) {
        swap(end, 0);
        end--;
        siftDown(0, end, cmpfunc);
    } 
}