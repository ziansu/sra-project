@org.junit.Test
public void testasdifftime2() {
    assertEval("argv <- structure(list(tim = c('3:20', '23:15', '2:'), format = '%H:%M'),     .Names = c('tim', 'format'));do.call('as.difftime', argv)");
}