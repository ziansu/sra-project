public konstructs.api.Stack take(int n) {
    return new konstructs.api.Stack(typeId, java.util.Arrays.copyOf(blocks, java.lang.Math.max(n, blocks.length)));
}