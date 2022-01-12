private static java.lang.String checkExpression(edu.wpi.cetask.TaskClass task, java.lang.String name) {
    java.lang.String type = task.getSlotType(name);
    return type == null ? "true" : "$$value == undefined || $$value === null || " + ("boolean".equals(type) ? "typeof $$value == \"boolean\"" : "string".equals(type) ? "typeof $$value == \"string\"" : "number".equals(type) ? "typeof $$value == \"number\"" : "Date".equals(type) ? "$$value.getUTCDate !== undefined" : "$$value instanceof " + type);
}