public void init(int numAllocation) {
    this.batch_items = null;
    this.allocation_input_yuv = null;
    this.allocations = new android.renderscript.Allocation[numAllocation];
    for (int i = 0; i < numAllocation; i++) {
        this.allocations[i] = null;
    }
    this.num_allocation = numAllocation;
    this.index_allocation = -1;
    this.allocation_context = null;
}