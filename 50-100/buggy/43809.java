@org.junit.Before
public void setUp() {
    statup_time = new java.util.Date(((java.lang.System.currentTimeMillis()) / 1000));
    file = org.gnode.nix.File.open("test_block.h5", FileMode.Overwrite);
    block = file.createBlock("block_one", "dataset");
    block_other = file.createBlock("block_two", "dataset");
    block_null = null;
}