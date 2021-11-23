@org.junit.Test
public void testInheritance() {
    assertEval("A0R5 <- setRefClass('A0R5', field = list(a = 'numeric')); B0R5 <- setRefClass('B0R5', contains = 'A0R5'); obj <- B0R5$new(a = 1); obj$a");
    assertEval("A1R5 <- setRefClass('A1R5', methods = list(foo = function() { print('hello') })); B1R5 <- setRefClass('B1R5', contains = 'A1R5'); obj <- B1R5$new(); obj$foo()");
    assertEval("A2R5 <- setRefClass('A2R5', methods = list(foo = function() { print('hello') })); B2R5 <- setRefClass('B2R5', methods = list(foo = function() { print('world') }), contains = 'A2R5'); obj <- B2R5$new(); obj$foo()");
    assertEval("A3R5 <- setRefClass('A3R5', methods = list(foo = function() { print('hello') })); B3R5 <- setRefClass('B3R5', methods = list(foo = function() { callSuper(); print('world') }), contains = 'A3R5'); obj <- B3R5$new(); obj$foo()");
}