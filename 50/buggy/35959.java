private void _buildInternalArray(int capacity) {
    T[] bag = ((T[]) (new java.lang.Object[capacity]));
    this._bag = bag;
    this._count = 0;
}