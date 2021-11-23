public model.Member presentChangeMember(java.util.ArrayList<model.Member> members) {
    presentMembers(members);
    java.lang.System.out.println("Choose a member to change by entering the corresponding number:");
    java.lang.String memberLine = in.nextLine();
    if (isInteger(memberLine, members.size())) {
        return members.get(((input) - 1));
    }else {
        java.lang.System.out.println((("Please provide a Integer between 1 and " + (members.size())) + "."));
        presentChangeMember(members);
    }
    return null;
}