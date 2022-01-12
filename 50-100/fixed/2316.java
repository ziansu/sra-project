public boolean findNextBlockToClear() {
    int count = 0;
    do {
        count++;
        if (!(decrementBlock())) {
            return false;
        }
    } while (((worldBlockAir()) || (doesSchematicBlockEqualWorldBlock())) && (count < (com.minecolonies.configuration.Configurations.maxBlocksCheckedByBuilder)) );
    return true;
}