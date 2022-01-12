@org.junit.Test(expected = xyz.swordfeng.jobsystem.ValidationError.class)
public void createJobWithZeroSkills() throws User.AuthFailure, xyz.swordfeng.jobsystem.ValidationError {
    java.lang.String username = "user1";
    xyz.swordfeng.jobsystem.User user = xyz.swordfeng.jobsystem.User.login(username, "password");
    java.lang.String name = "Programmer";
    java.lang.String address = "China";
    java.lang.String[] skills = new java.lang.String[0];
    java.lang.String education = "大学";
    xyz.swordfeng.jobsystem.Job job = new xyz.swordfeng.jobsystem.Job(user, name, address, 10, skills, education);
}