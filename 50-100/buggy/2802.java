@org.junit.Before
public void setUp() throws java.lang.Exception {
    java.util.HashMap<model.Reviewer, java.lang.String> reviews = new java.util.HashMap<model.Reviewer, java.lang.String>();
    java.util.ArrayList<java.util.UUID> authors = new java.util.ArrayList<java.util.UUID>();
    java.lang.String title = "Aerodynamics of a Hamburger";
    java.util.Date date = new java.util.Date();
    myPaper = new model.Manuscript(title, date, reviews, authors, new java.io.File(""));
}