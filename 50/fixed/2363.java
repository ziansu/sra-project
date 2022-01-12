@org.junit.Before
public void setup() {
    model = model.Model.getTestInstance();
    userObj1 = model.createAccount(user1, pass1, AccountType.User);
}