public model.Member presentViewMember(java.util.ArrayList<model.Member> members) {
    presentMembers(members);
    java.lang.System.out.println("Choose a member to view by entering the corresponding number:");
    java.lang.String memberLine = in.nextLine();
    if (isInteger(memberLine, members.size())) {
        return members.get(((input) - 1));
    }else {
        java.lang.System.out.println((("Please provide a Integer between 1 and " + (members.size())) + "."));
        return presentViewMember(members);
    }
}