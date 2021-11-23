@org.junit.Before
public void setUp() throws java.io.FileNotFoundException {
    jStack = new JStack(1, 4, 2, 5, new Board(new java.util.Scanner(new java.io.File("jStackTestConfig.txt")), new Die(10)), new Die(10));
    d = new Die(10);
}