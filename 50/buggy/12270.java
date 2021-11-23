@org.junit.Before
public void setUp() throws java.lang.Exception {
    this.game = new com.workingbit.xlspaceship.domain.Game(new com.workingbit.xlspaceship.domain.User("player-1", "player-1"), new com.workingbit.xlspaceship.domain.User("player-2", "player-2"), "standard");
}