public static void pushAssignment(Assignment assign) {
    TreeNode.solution.push(assign);
    assign.person.setRoom(assign.room);
    assign.room.assignPerson(assign.person);
    if (assign.room.isFull())
        TreeNode.rooms.remove(assign.room);
    
    TreeNode.people.pop();
}