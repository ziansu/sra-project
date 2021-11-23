void update(int target, int value) {
    int index = (target - 1) + (capacity);
    int diff = value - (tree[index].value);
    maintain(index, diff);
}