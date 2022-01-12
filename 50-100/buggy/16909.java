@org.junit.Before
public void setUp() {
    statup_time = new java.util.Date(((java.lang.System.currentTimeMillis()) / 1000));
    file_open = org.gnode.nix.File.open("test_file.h5", FileMode.Overwrite);
    file_other = org.gnode.nix.File.open("test_file_other.h5", FileMode.Overwrite);
    file_null = null;
}