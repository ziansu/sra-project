@java.lang.Override
public java.lang.String toString() {
    return (((((("#" + (todoId)) + (isCompleted() ? " [X]" : " [ ]")) + ", created: ") + (createdAt)) + ", task: ") + (todoText)) + (isCompleted() ? ", completed: " + (completedAt) : "");
}