public void Rotate(int value) {
    if ((shape) < ((Blocks.blocks[GetTypeIndex(type)].length) - 1)) {
        (shape)++;
    }else {
        shape = 0;
    }
    SetBlockFromMatrix(tetrismvclone.blocks.Blocks.GetBlock(GetTypeIndex(type), shape), 0, 0);
}